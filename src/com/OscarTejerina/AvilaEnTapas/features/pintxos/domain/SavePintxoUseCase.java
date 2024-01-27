package com.OscarTejerina.AvilaEnTapas.features.pintxos.domain;

public class SavePintxoUseCase {

    private PintxosRepository pintxosRepository;

    public SavePintxoUseCase (PintxosRepository PintxoRepository){

        this.pintxosRepository = pintxosRepository;
    }
    public void execute (Pintxo pintxo){
        this.pintxosRepository.savePintxo (pintxo);
    }
}
