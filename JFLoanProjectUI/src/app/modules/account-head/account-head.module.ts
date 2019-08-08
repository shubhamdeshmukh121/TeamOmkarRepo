import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { AccountHeaddashboardComponent } from "./account-headdashboard/account-headdashboard.component";
import { Routes, RouterModule } from "@angular/router";
import { PaymenthistoryComponent } from "./paymenthistory/paymenthistory.component";
import { PayslipComponent } from "./payslip/payslip.component";
import { PayComponent } from "./pay/pay.component";
import { MatTableModule } from "@angular/material";
import { MatExpansionModule } from "@angular/material/expansion";
import { MatRadioModule } from "@angular/material/radio";

const AccountHeadrouting: Routes = [
  { path: "accountheaddashboard", component: AccountHeaddashboardComponent },
  { path: "paymenthistory", component: PaymenthistoryComponent },
  { path: "paymentslip", component: PayslipComponent },
  { path: "pay", component: PayComponent }
];

@NgModule({
  declarations: [
    AccountHeaddashboardComponent,
    PaymenthistoryComponent,
    PayslipComponent,
    PayComponent
  ],
  exports: [
    AccountHeaddashboardComponent,
    PaymenthistoryComponent,
    PayslipComponent,
    PayComponent,
    MatExpansionModule,
    MatRadioModule
  ],
  imports: [
    RouterModule.forChild(AccountHeadrouting),
    CommonModule,
    MatTableModule,
    MatExpansionModule,
    MatRadioModule
  ]
})
export class AccountHeadModule {}
