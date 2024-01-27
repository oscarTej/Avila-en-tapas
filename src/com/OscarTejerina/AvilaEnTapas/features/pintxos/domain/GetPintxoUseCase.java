package com.OscarTejerina.AvilaEnTapas.features.pintxos.domain;

import java.util.ArrayList;

public class GetPintxoUseCase {
    private PintxosRepository pintxosRepository;

    public GetPintxoUseCase(PintxosRepository pintxosRepository){

        this.pintxosRepository = pintxosRepository;
    }
    public Pintxo execute (String pintxoId){

        return this.pintxosRepository.obtainPintxo(pintxoId);
    }



}
