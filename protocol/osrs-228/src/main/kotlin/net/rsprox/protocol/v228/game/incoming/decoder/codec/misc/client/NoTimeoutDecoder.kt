package net.rsprox.protocol.v228.game.incoming.decoder.codec.misc.client

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.game.incoming.model.misc.client.NoTimeout
import net.rsprox.protocol.v228.game.incoming.decoder.prot.GameClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprot.protocol.metadata.Consistent

@Consistent
public class NoTimeoutDecoder : ProxyMessageDecoder<NoTimeout> {
    override val prot: ClientProt = GameClientProt.NO_TIMEOUT

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): NoTimeout = NoTimeout
}
