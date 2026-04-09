package questao01;

public class Teste {
    public static void main(String[] args) {
        ExportarRelatorio r1 = new RelatorioPDF();
        r1.exportar();

        ExportarRelatorio r2 = new RelatorioXML();
        r2.exportar();

        ExportarRelatorio r3 = new RelatorioCSV();
        r3.exportar();
    }
}