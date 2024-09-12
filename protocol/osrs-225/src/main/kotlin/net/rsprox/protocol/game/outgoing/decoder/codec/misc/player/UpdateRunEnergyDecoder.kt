package net.rsprox.protocol.game.outgoing.decoder.codec.misc.player

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.metadata.Consistent
import net.rsprox.protocol.ProxyMessageDecoder
import net.rsprox.protocol.game.outgoing.decoder.prot.GameServerProt
import net.rsprox.protocol.game.outgoing.model.misc.player.UpdateRunEnergy
import net.rsprox.protocol.session.Session

@Consistent
public class UpdateRunEnergyDecoder : ProxyMessageDecoder<UpdateRunEnergy> {
    override val prot: ClientProt = GameServerProt.UPDATE_RUNENERGY

    override fun decode(
        buffer: JagByteBuf,
        session: Session,
    ): UpdateRunEnergy {
        val energy = buffer.g2()
        return UpdateRunEnergy(
            energy,
        )
    }
}
