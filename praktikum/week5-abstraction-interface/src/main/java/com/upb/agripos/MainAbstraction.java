package com.upb.agripos;

import com.upb.agripos.model.kontrak.Receiptable;
import com.upb.agripos.model.Cash;
import com.upb.agripos.model.EWallet;
import com.upb.agripos.model.Pembayaran;
import com.upb.agripos.model.TransferBank;
import com.upb.agripos.util.CreditBy;

public class MainAbstraction {
    public static void main(String[] args) {
        Pembayaran cash = new Cash("INV-001", 87000, 100000);
        Pembayaran ew = new EWallet("INV-002", 175000, "topikhidayat@ewallet", "987654");
        Pembayaran transfer = new TransferBank("INV-003", 150000, "BTN", true);


        System.out.println(((Receiptable) cash).cetakStruk());
        System.out.println(((Receiptable) ew).cetakStruk());
        System.out.println(((Receiptable) transfer).cetakStruk());
    
        CreditBy.print("Toufik Nur Hidayat", "240320567");
    }
}