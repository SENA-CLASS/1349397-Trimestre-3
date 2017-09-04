package co.edu.sena.lession3;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private Date date;
    private List<Shirt> shirtList;
    private double totalPrice;
    private List<FormOfPayment> formOfPaymentList;
    private List<CSR> csrList;
    private boolean status;

}
