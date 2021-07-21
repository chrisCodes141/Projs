using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{
    //DropDownList dd = new DropDownList();
    DropDownList dd = new DropDownList();

    protected void Page_Load(object sender, EventArgs e)
    {
        if (!Page.IsPostBack ) 
        {
            Session["BoardingLocation"] = "Texas";
        }
    }
    protected void btnProceed_Click(object sender, EventArgs e)
    {
        string BoardingLocation;
        BoardingLocation = DropDownList1.SelectedValue.ToString();

        Session["BoardingLocation"] = BoardingLocation;
        Response.Redirect("page2.aspx");
    }
}
