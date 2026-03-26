package exercicio03;

public class Teste {
    public static void main(String[] args) {
        Importador imp = new ImportadorCSV();
        imp.importar("dados.csv");

        imp = new ImportadorJSON();
        imp.importar("config.json");
    }
}