package com.OscarTejerina.AvilaEnTapas.features.pintxos.domain;

import java.util.ArrayList;

import java.util.List;

public  interface PintxosRepository {

    ArrayList<Pintxo> obtainPintxos();
    Pintxo obtainPintxo (String Pintxoid);
    void deletePintxo (String pintxoId);
    void savePintxo (Pintxo pintxo);
    void updatePintxo( Pintxo pintxo);
}
