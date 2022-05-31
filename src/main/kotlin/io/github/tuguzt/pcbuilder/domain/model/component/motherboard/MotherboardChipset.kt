package io.github.tuguzt.pcbuilder.domain.model.component.motherboard

import kotlinx.serialization.Serializable

/**
 * Chipset type of the [motherboard][Motherboard].
 */
@Serializable
public sealed interface MotherboardChipset {
    /**
     * AMD chipsets.
     */
    @Serializable
    public enum class AMD : MotherboardChipset {
        AMD690G,
        AMD740G,
        AMD760G,
        AMD770,
        AMD780G,
        AMD780L,
        AMD785G,
        AMD790FX,
        AMD790GX,
        AMD790X,
        AMD870,
        AMD880G,
        AMD880GX,
        AMD890FX,
        AMD890GX,
        AMD970,
        AMD990FX,
        AMD990X,
        A320,
        A520,
        A55,
        A58,
        A68H,
        A68M,
        A70M,
        A75,
        A78,
        A85X,
        A88X,
        AM1,
        B350,
        B450,
        B550,
        HudsonD1,
        HudsonM1,
        SR5690,
        TRX40,
        X370,
        X399,
        X470,
        X570,
    }

    /**
     * Intel chipsets.
     */
    @Serializable
    public enum class Intel : MotherboardChipset {
        Intel3450,
        Intel5520,
        B150,
        B250,
        B360,
        B365,
        B43,
        B460,
        B560,
        B65,
        B660,
        B75,
        B85,
        C204,
        C206,
        C222,
        C224,
        C226,
        C232,
        C236,
        C242,
        C246,
        C602,
        C602J,
        C606,
        C612,
        G31,
        G33,
        G41,
        G43,
        G45,
        H110,
        H170,
        H270,
        H310,
        H370,
        H410,
        H470,
        H510,
        H55,
        H57,
        H570,
        H61,
        H610,
        H67,
        H670,
        H77,
        H81,
        H87,
        H97,
        ICH8M,
        NM10,
        NM70,
        P35,
        P43,
        P45,
        P55,
        P67,
        Q170,
        Q270,
        Q370,
        Q45,
        Q470,
        Q57,
        Q570,
        Q67,
        Q670,
        Q77,
        Q87,
        X299,
        X58,
        X79,
        X99,
        Z170,
        Z270,
        Z370,
        Z390,
        Z490,
        Z590,
        Z68,
        Z690,
        Z75,
        Z77,
        Z87,
        Z97,
    }

    /**
     * NVIDIA chipsets.
     */
    @Serializable
    public sealed interface NVIDIA : MotherboardChipset {
        /**
         * GeForce series.
         */
        @Serializable
        public enum class GeForce : NVIDIA {
            GeForce6100,
            GeForce6150,
            GeForce6150SE,
            GeForce7025,
            GeForce7050,
            GeForce8200,
            GeForce9300,
        }

        /**
         * ION series.
         */
        @Serializable
        public object ION : NVIDIA

        /**
         * nForce series.
         */
        @Serializable
        public enum class NForce : NVIDIA {
            NForce430MCP,
            NForce590SLIMCP,
            NForce630a,
            NForce720D,
            NForce750a,
            NForce750aSLI,
            NForce750iSLI,
            NForce790iSLI,
            NForce980a,
            NForce980aSLI,
        }
    }

    /**
     * VIA chipsets.
     */
    @Serializable
    public enum class VIA : MotherboardChipset {
        P4M890,
    }

    /**
     * CPU integrated chipset.
     */
    @Serializable
    public object CPUIntegrated : MotherboardChipset
}
