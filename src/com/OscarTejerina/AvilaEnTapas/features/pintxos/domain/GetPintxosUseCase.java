package com.OscarTejerina.AvilaEnTapas.features.pintxos.domain;

import java.util.ArrayList;

public class GetPintxosUseCase {
    private PintxosRepository pintxosRepository;

    public GetPintxosUseCase (PintxosRepository pintxosRepository){

        this.pintxosRepository = pintxosRepository;
    }
    public ArrayList<Pintxo> execute(){

        return pintxosRepository.obtainPintxos();
    }
}
