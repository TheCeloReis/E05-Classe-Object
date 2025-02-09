public class PessoaJuridica extends Client {
    private String cnpj;
    private int numFuncionarios;
    private String setor;

    public PessoaJuridica(String name, String address, String cnpj, int numFuncionarios, String setor) {
        super(name, address);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    @Override
    public void print() {
        System.out.println("Name: " + this.name + "\tCnpj: " + this.cnpj + "\tFuncionarios: " + this.numFuncionarios
                + "\tSetor: " + this.setor + "\tEndereço" + this.address);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\tCnpj: " + this.cnpj + "\tFuncionarios: " + this.numFuncionarios + "\tSetor: "
                + this.setor + "\tEndereço" + this.address;
    }

    @Override
    public boolean equals(Object obj) {
        return this.cnpj == ((PessoaJuridica) obj).cnpj;
    }
}
