package net.rsprox.protocol.v229.game.outgoing.decoder.codec.interfaces

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.util.gCombinedIdAlt3
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.model.interfaces.IfSetPosition
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v229.game.outgoing.decoder.prot.GameServerProt

internal class IfSetPositionDecoder : ProxyMessageDecoder<IfSetPosition> {
    override val prot: ClientProt = GameServerProt.IF_SETPOSITION

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): IfSetPosition {
        val combinedId = buffer.gCombinedIdAlt3()
        val y = buffer.g2Alt2()
        val x = buffer.g2Alt2()
        return IfSetPosition(
            combinedId.interfaceId,
            combinedId.componentId,
            x,
            y,
        )
    }
}
