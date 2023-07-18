public class FinalPregunta3
{
    private int numeroCuenta;
    private double saldo;

    public FinalPregunta3(int numeroCuenta, double saldo)
    {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public int getNumeroCuenta()
    {
        return numeroCuenta;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public static void main(String[] args)
    {
        FinalPregunta3[] cuentas =
                {
                new FinalPregunta3(1234, 100000),
                new FinalPregunta3(4321, 80000),
                new FinalPregunta3(9876, 50000)
        };

        double saldoMasAlto = cuentas[0].getSaldo();
        int numeroCuentaSaldoMasAlto = cuentas[0].getNumeroCuenta();

        for (FinalPregunta3 cuenta : cuentas)
        {
            if (cuenta.getSaldo() > saldoMasAlto)
            {
                saldoMasAlto = cuenta.getSaldo();
                numeroCuentaSaldoMasAlto = cuenta.getNumeroCuenta();
            }
        }

        System.out.println("Saldo más alto: " + saldoMasAlto);
        System.out.println("Número de cuenta: " + numeroCuentaSaldoMasAlto);
    }
}
