package Ex1;

public class Multiplicacao extends Soma{
    @Override
    public int executar(int valor1, int valor2) {
        int result = 0;
        for (int i = 0; i < valor2; i++) {
            result += valor1;
        }
        return result;
    }
}
