package net.rsprox.protocol.v231.game.outgoing.decoder.codec.interfaces

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.util.gCombinedId
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.model.interfaces.IfSetPlayerModelSelf
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v231.game.outgoing.decoder.prot.GameServerProt

internal class IfSetPlayerModelSelfDecoder : ProxyMessageDecoder<IfSetPlayerModelSelf> {
    override val prot: ClientProt = GameServerProt.IF_SETPLAYERMODEL_SELF

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): IfSetPlayerModelSelf {
        val copyObjs = buffer.g1() == 0
        val combinedId = buffer.gCombinedId()
        return IfSetPlayerModelSelf(
            combinedId.interfaceId,
            combinedId.componentId,
            copyObjs,
        )
    }
}
