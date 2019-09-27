public class InvoicePrinter extends Address {
    public static void main (String [] args)
    {
        Address samsAddress
                = new Address("Sam Small Appliances", "100 Main Street", "Fullerton", "CA", "98475");
        Invoice samsInvoice = new Invoice(samsAddress);
        samsInvoice.add(new Product("Toaster", 29.95), 3);
        samsInvoice.add(new Product("Lube", 10.00), 2);
        samsInvoice.add(new Product("ecstasy", 15.00), 5);

        System.out.println(samsInvoice.format());
    }
}
