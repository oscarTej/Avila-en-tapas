package com.OscarTejerina.AvilaEnTapas.features.pintxos.domain;

public class UpdatePintxoUseCase {

    private PintxosRepository pintxosRepository;

    public UpdatePintxoUseCase (PintxosRepository pintxosRepository){

        this.pintxosRepository = pintxosRepository;
    }
    public  void execute (Pintxo pintxo) {
        this.pintxosRepository.updatePintxo(pintxo);

    }
}
