package net.rsprox.protocol.v231.game.outgoing.decoder.codec.specific

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.model.specific.PlayerSpotAnimSpecific
import net.rsprox.protocol.session.Session
import net.rsprox.protocol.v231.game.outgoing.decoder.prot.GameServerProt

internal class PlayerSpotAnimSpecificDecoder : ProxyMessageDecoder<PlayerSpotAnimSpecific> {
    override val prot: ClientProt = GameServerProt.PLAYER_SPOTANIM_SPECIFIC

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): PlayerSpotAnimSpecific {
        val slot = buffer.g1Alt2()
        val index = buffer.g2Alt2()
        val id = buffer.g2Alt2()
        val packed = buffer.g4Alt2()
        val height = packed ushr 16
        val delay = packed and 0xFFFF
        return PlayerSpotAnimSpecific(
            index,
            id,
            slot,
            height,
            delay,
        )
    }
}
