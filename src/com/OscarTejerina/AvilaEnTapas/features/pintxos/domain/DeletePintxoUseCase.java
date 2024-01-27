package com.OscarTejerina.AvilaEnTapas.features.pintxos.domain;

import java.util.ArrayList;
public class DeletePintxoUseCase {
    private PintxosRepository pintxosRepository;

    public DeletePintxoUseCase(PintxosRepository pintxosRepository){

        this.pintxosRepository = pintxosRepository;
    }

    public void execute(String pintxoId){

        pintxosRepository.deletePintxo(pintxoId);
    }
}
