/*
 * MIT License
 *
 * Copyright (c) 2020 ALİ GÜNGÖR
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * @author Ali Güngör (aligng1620@gmail.com)
 */

package tr.havelsan.ueransim.core.nodes;

import tr.havelsan.ueransim.api.gnb.GNodeB;
import tr.havelsan.ueransim.core.GnbSimContext;
import tr.havelsan.ueransim.core.threads.NodeLooperThread;
import tr.havelsan.ueransim.core.threads.SctpRecevierThread;
import tr.havelsan.ueransim.utils.Logging;
import tr.havelsan.ueransim.utils.Tag;

public class GnbNode {

    public static void run(GnbSimContext ctx) {
        if (ctx.amfContexts.isEmpty()) {
            Logging.error(Tag.SYSTEM, "AMF contexts in GNB{%s} is empty", ctx.ctxId);
        }

        for (var amfCtx : ctx.amfContexts.values()) {
            new SctpRecevierThread(ctx, amfCtx.guami, amfCtx.sctpClient).start();
        }

        var looperThread = new NodeLooperThread<>(ctx, GNodeB::cycle);
        ctx.setLooperThread(looperThread);
        looperThread.start();
    }
}
