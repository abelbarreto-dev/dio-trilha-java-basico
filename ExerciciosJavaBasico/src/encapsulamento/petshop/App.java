package encapsulamento.petshop;

import encapsulamento.petshop.maquina.IMaquinaBanho;
import encapsulamento.petshop.maquina.MaquinaBanho;
import encapsulamento.petshop.pet.Pet;

public class App {
    public static void main(String[] args) {
        IMaquinaBanho maquina = new MaquinaBanho();

        var fiana = new Pet("Fiana");

        maquina.checarNivelAgua();
        maquina.checarNivelXampu();

        maquina.isPetBanhando();

        maquina.colocarPet(fiana);
        maquina.banharPet();

        maquina.isPetBanhando();

        maquina.checarNivelXampu();
        maquina.checarNivelAgua();

        maquina.abastecerAgua();
        maquina.abastecerXampu();
    }
}
