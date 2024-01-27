package com.OscarTejerina.AvilaEnTapas.features.pintxos.data;

import com.OscarTejerina.AvilaEnTapas.features.pintxos.domain.Pintxo;
import com.OscarTejerina.AvilaEnTapas.features.pintxos.domain.PintxosRepository;

import java.util.ArrayList;

public class PintxosDataRepository implements PintxosRepository {

    private static PintxosDataRepository instance = null;

    private ArrayList<Pintxo> localPintxos = new ArrayList<>();

    private PintxosDataRepository() {

        iniData();
    }

    @Override
    public ArrayList<Pintxo> obtainPintxos() {
        return localPintxos;
    }

    @Override
    public Pintxo obtainPintxo(String pintxoId) {
        for (Pintxo pintxo : localPintxos) {
            //si el id que pedimos es igual a algun elemento de la lista que devuelva exactamente ese pintxo
            if (pintxo.getId().equals(pintxoId)) {
                return pintxo;
            }
        }
        return null;
    }

    @Override
    public void savePintxo(Pintxo pintxo) {
        localPintxos.add(pintxo);

    }

    @Override
    public void updatePintxo(Pintxo pintxo) {
        deletePintxo(pintxo.getId());
        savePintxo(pintxo);

    }

    @Override
    public void deletePintxo(String pintxoId) {
        for (int i = 0; i < localPintxos.size(); i++) {
            if (localPintxos.get(i).getId().equals(pintxoId)) {
                localPintxos.remove(i);
            }
        }
    }

    private void iniData() {

        localPintxos.add(new Pintxo("1", "tosta de solomillo con cebolla caramelizada", "Txiringüelo", "1400", "7", "1000", "200", "solomillo,cebolla caramelizasda,mayonesa de trufa"));
        localPintxos.add(new Pintxo("2", "secreto a la milanesa", "Txiringüelo", "1000", "5", "1000", "200", "secreto iberico, queso emental, queso gouda"));
        localPintxos.add(new Pintxo("3", "croquetas de rabo de toro", "Txiringüelo", "1600", "8", "1000", "200", "rabo de toro, besamel"));
        localPintxos.add(new Pintxo("4", "carpaccio de atun rojo", "Txiringüelo", "2000", "10", "1000", "200", "atun rojo, aceite balsamico de ajo"));
        localPintxos.add(new Pintxo("5", "preñao de chorizo", "Txiringüelo", "1000", "5", "1000", "200", "chorizo, queso, pimientos"));

    }

    public static PintxosDataRepository newInstance() {
        if (instance == null) {
            instance = new PintxosDataRepository();
        }
        return instance;
    }
}
