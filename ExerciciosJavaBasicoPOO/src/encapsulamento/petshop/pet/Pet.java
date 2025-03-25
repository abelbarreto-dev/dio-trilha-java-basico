package encapsulamento.petshop.pet;

public class Pet {
    private String name;
    private boolean limpo;

    public Pet(String name) {
        this.name = name;
        this.limpo = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}
