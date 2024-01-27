package com.OscarTejerina.AvilaEnTapas.features.pintxos.presentation;

import com.OscarTejerina.AvilaEnTapas.features.pintxos.data.PintxosDataRepository;
import com.OscarTejerina.AvilaEnTapas.features.pintxos.domain.*;
import java.util.ArrayList;
public class MainPintxo {

    /** mostrar un listado de mascotas **\
     *
     */
    public static void printPintxos(){

        GetPintxosUseCase pintxosUseCase = new GetPintxosUseCase(PintxosDataRepository.newInstance());
        ArrayList<Pintxo> pintxos = pintxosUseCase.execute();
        // imprimimos cada una de las mascotas
        System.out.println(pintxos.toString());
    }

    public static void printPintxo(String pintxoId){
        GetPintxoUseCase getPintxoUseCase = new GetPintxoUseCase(PintxosDataRepository.newInstance());
        Pintxo pintxo = getPintxoUseCase.execute(pintxoId);
        System.out.println(pintxo.toString());
    }

    public static void deletePintxo (String pintxoId){

        DeletePintxoUseCase deletePintxoUseCase = new DeletePintxoUseCase(PintxosDataRepository.newInstance());
        deletePintxoUseCase.execute(pintxoId);
    }
    public static void createPintxo(Pintxo pintxo){
        PintxosDataRepository pintxosDataRepository = PintxosDataRepository.newInstance();
        SavePintxoUseCase savePintxoUseCase = new SavePintxoUseCase(pintxosDataRepository);
        savePintxoUseCase.execute(pintxo);
    }

    public static void updatePintxo (Pintxo pintxo){
        UpdatePintxoUseCase updatePintxoUseCase = new UpdatePintxoUseCase(PintxosDataRepository.newInstance());
        updatePintxoUseCase.execute(pintxo);

        System.out.println("");
    }
}
