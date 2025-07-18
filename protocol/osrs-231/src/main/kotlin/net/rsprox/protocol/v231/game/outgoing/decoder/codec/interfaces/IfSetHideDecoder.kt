package net.rsprox.protocol.v231.game.outgoing.decoder.codec.interfaces

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.util.gCombinedIdAlt3
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.model.interfaces.IfSetHide
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v231.game.outgoing.decoder.prot.GameServerProt

internal class IfSetHideDecoder : ProxyMessageDecoder<IfSetHide> {
    override val prot: ClientProt = GameServerProt.IF_SETHIDE

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): IfSetHide {
        val hidden = buffer.g1Alt1() == 1
        val combinedId = buffer.gCombinedIdAlt3()
        return IfSetHide(
            combinedId.interfaceId,
            combinedId.componentId,
            hidden,
        )
    }
}
