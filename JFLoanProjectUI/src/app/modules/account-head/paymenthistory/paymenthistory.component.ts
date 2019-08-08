import { Component, OnInit } from "@angular/core";
import { MatTableModule } from "@angular/material/table";

export interface PeriodicElement {
  name: string;
  email: string;
  mode: string;
  productinfo: string;
  paymentdate: string;
  paymentstatus: string;
  phone: number;
  position: number;
  txnid: number;
  amount: number;
  mihpayid: number;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {
    position: 1,
    txnid: 222,
    mihpayid: 1.0079,
    name: "H",
    email: "g",
    phone: 11,
    mode: "j",
    productinfo: "jj",
    paymentdate: "yftyf",
    paymentstatus: "kf",
    amount: 100
  }
];
@Component({
  selector: "app-paymenthistory",
  templateUrl: "./paymenthistory.component.html",
  styleUrls: ["./paymenthistory.component.scss"]
})
export class PaymenthistoryComponent implements OnInit {
  displayedColumns: string[] = [
    "position",
    "txnid",
    "mihpayid",
    "name",
    "email",
    "phone",
    "mode",
    "productinfo",
    "paymentdate",
    "paymentstatus",
    "amount"
  ];

  dataSource = ELEMENT_DATA;

  constructor() {}

  ngOnInit() {}
}
