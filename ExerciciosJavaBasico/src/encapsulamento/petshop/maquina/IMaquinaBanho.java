package encapsulamento.petshop.maquina;

import encapsulamento.petshop.pet.Pet;

public interface IMaquinaBanho {
    abstract void banharPet();
    abstract void abastecerAgua();
    abstract void abastecerXampu();
    abstract void checarNivelAgua();
    abstract void checarNivelXampu();
    abstract void isPetBanhando();
    abstract void colocarPet(Pet pet);
    abstract void retirarPet();
    abstract void limparMaquina();
}
