import com.sun.nio.sctp.*

import java.*
import java.io.*
import java.net.*
import java.nio.*
import java.nio.charset.*
import java.text.*
import java.util.*

object SCTPTestServer {

    fun start(port: Int) {
        val serverAddress = InetSocketAddress(port)
        val ssc = SctpServerChannel.open()
        ssc.bind(serverAddress)
        println("server started listening on port $port");

        val incomingBuffer = ByteBuffer.allocateDirect(1073741824)
        while (true) {
            val sc = ssc.accept()

            val assocHandler = AssociationHandler()
            var inMessageInfo: MessageInfo?
            while (true) {
                inMessageInfo = sc.receive(incomingBuffer, System.out, assocHandler)
                if (inMessageInfo == null || inMessageInfo.bytes() == -1) {
                    break
                }

                val receivedBytes = ByteArray(inMessageInfo.bytes())
                for (i in 0 until inMessageInfo.bytes()) {
                    receivedBytes[i] = incomingBuffer[i]
                }

                handleMessage(sc, receivedBytes)
            }
            sc.close()
        }
    }

    private fun handleMessage(channel: SctpChannel, data: ByteArray) {
        val msg = MessageInfo.createOutgoing(null, 0)
        msg.payloadProtocolID(60)
        channel.send(ByteBuffer.wrap(byteArrayOf(1, 2, 3, 4)), msg)
    }

    private class AssociationHandler : AbstractNotificationHandler<PrintStream>() {
        override fun handleNotification(not: AssociationChangeNotification, stream: PrintStream?): HandlerResult {
            if (not.event() == AssociationChangeNotification.AssocChangeEvent.COMM_UP) {
                val outbound = not.association().maxOutboundStreams()
                val inbound = not.association().maxInboundStreams()
                stream!!.printf(
                    "New association setup with %d outbound streams" + ", and %d inbound streams.\n",
                    outbound, inbound
                )
            }
            return HandlerResult.CONTINUE
        }
        override fun handleNotification(not: ShutdownNotification?, stream: PrintStream): HandlerResult {
            stream.printf("The association has been shutdown.\n")
            return HandlerResult.RETURN
        }
    }
}