package net.rsprox.protocol.v231.game.incoming.decoder.codec.misc.client

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.metadata.Consistent
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.incoming.model.misc.client.DetectModifiedClient
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v231.game.incoming.decoder.prot.GameClientProt

@Consistent
public class DetectModifiedClientDecoder : ProxyMessageDecoder<DetectModifiedClient> {
    override val prot: ClientProt = GameClientProt.DETECT_MODIFIED_CLIENT

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): DetectModifiedClient {
        val code = buffer.g4()
        return DetectModifiedClient(code)
    }
}
