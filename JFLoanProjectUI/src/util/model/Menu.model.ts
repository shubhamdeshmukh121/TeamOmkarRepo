export class Menu {
  public static menu: Array<any> = [
    {
      relationshipexecutive: [
        {
          label: "DashBoard",
          key: "relationshipexecutivedashboard",
          icon: "dashboard"
        }
      ],

      operationhead: [
        { label: "DashBoard", key: "operationheaddashboard", icon: "dashboard" }
      ],

      operationexecutive: [
        {
          label: "DashBoard",
          key: "operationexecutivedashboard",
          icon: "dashboard"
        }
      ],
      telecaller: [
        { label: "DashBoard", key: "telecallerdashboard", icon: "dashboard" }
      ],
      legalhead: [
        { label: "DashBoard", key: "legalheaddashboard", icon: "dashboard" }
      ],
      accounthead: [
        { label: "DashBoard", key: "accountheaddashboard", icon: "dashboard" },
        {
          label: "Payment History",
          key: "paymenthistory",
          icon: "dashboard"
        },
        {
          label: "Payment Slip",
          key: "paymentslip",
          icon: "dashboard"
        },
        {
          label: "Pay",
          key: "pay",
          icon: "dashboard"
        }
      ],
      mr: [{ label: "DashBoard", key: "mrdashboard", icon: "dashboard" }]
    }
  ];
}
