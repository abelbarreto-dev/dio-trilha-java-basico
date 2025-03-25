package encapsulamento.petshop.maquina;

import encapsulamento.petshop.pet.Pet;

public class MaquinaBanho implements IMaquinaBanho {
    private int litrosAgua;
    private int litrosXampu;
    private Pet pet;
    private boolean ocupada;

    public MaquinaBanho() {
        this.litrosAgua = 30;
        this.litrosXampu = 10;
        this.pet = null;
        this.ocupada = false;
    }

    int getLitrosAgua() {
        return litrosAgua;
    }

    void setLitrosAgua(int litrosAgua) {
        this.litrosAgua = litrosAgua;
    }

    int getLitrosXampu() {
        return litrosXampu;
    }

    void setLitrosXampu(int litrosXampu) {
        this.litrosXampu = litrosXampu;
    }

    boolean isOcupada() {
        return ocupada;
    }

    void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    private Pet getPet() {
        return pet;
    }

    private void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void banharPet() {
        System.out.println("Banhando Pet...");

        if (!this.isOcupada()) {
            System.out.println("Máquina vázia, não é possível banhar!");
            return;
        }

        if (this.getLitrosAgua() < 10 || this.getLitrosXampu() < 2) {
            System.out.println("Nível Insuficiente de Xampu ou Água!");
            System.out.println("min. 10 L de água");
            System.out.println("min. 2 L de xampu");
            return;
        }

        this.setLitrosAgua(this.getLitrosAgua() - 10);
        this.setLitrosXampu(this.getLitrosXampu() - 2);
        this.getPet().setLimpo(true);
        System.out.println("Pet agora está limpo! Por favor retire da máquina!");
        this.retirarPet();
    }

    @Override
    public void abastecerAgua() {
        System.out.println("Abastecer água... (máx. 30L)");
        if (this.getLitrosAgua() == 30) {
            System.out.println("Abastecimento completo. " + this.getLitrosAgua() + " L.");
            return;
        }

        this.setLitrosAgua(this.getLitrosAgua() + 2);
        System.out.println("Litros: " + this.getLitrosAgua() + " L.");
    }

    @Override
    public void abastecerXampu() {
        System.out.println("Abastecer xampú... (máx. 10L)");
        if (this.getLitrosXampu() == 10) {
            System.out.println("Abastecimento completo. " + this.getLitrosXampu() + " L.");
            return;
        }

        this.setLitrosXampu(this.getLitrosXampu() + 2);
        System.out.println("Litros: " + this.getLitrosXampu() + " L.");
    }

    @Override
    public void checarNivelAgua() {
        System.out.println("Nível de Água (máx. 30 L): " + this.getLitrosAgua() + " L.");
    }

    @Override
    public void checarNivelXampu() {
        System.out.println("Nível de Xampu (máx. 10 L): " + this.getLitrosXampu() + " L.");
    }

    @Override
    public void isPetBanhando() {
        String banhar = this.isOcupada() ? "sim!" : "não!";

        System.out.println("Pet está banhando? " + banhar);
    }

    @Override
    public void colocarPet(Pet pet) {
        System.out.println("Colocando Pet na máquina...");
        if (!this.isOcupada()) {
            this.setPet(pet);
            this.setOcupada(true);
            System.out.println("Pet colocado na máquina.");
        }
        else
            System.out.println("Não foi possível, máquina ocupada!");
    }

    @Override
    public void retirarPet() {
        System.out.println("Retirando Pet da máquina...");
        if (this.isOcupada()) {
            this.setOcupada(false);
            System.out.println("Pet retirado da máquina.");

            if (!this.getPet().isLimpo()) {
                System.out.println("Mas, não estava limpo... Limpe a máquina!");
                this.limparMaquina();
            }

            this.setPet(null);
        }
        else
            System.out.println("Máquina já está vazia!");
    }

    @Override
    public void limparMaquina() {
        System.out.println("Limpando a máquina...");
        if (this.isOcupada()) {
            System.out.println("Retire primeiro o Pet da máquina!");
            return;
        }

        if (this.getLitrosAgua() < 3 || this.getLitrosXampu() < 1) {
            System.out.println("Água ou xampú insuficientes, reabasteça!");
            return;
        }

        this.setLitrosAgua(this.getLitrosAgua() - 3);
        this.setLitrosXampu(this.getLitrosXampu() - 1);
        System.out.println("Máquina limpa com sucesso.");
    }
}
