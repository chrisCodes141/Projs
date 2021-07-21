using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class page3 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void btnLogin_Click(object sender, EventArgs e)
    {
        string DepTime, DepDate, ArrTime, ArrDate;
        Session["DepTime"] = DepTime = TextBox2.Text;
        Session["DepDate"] = DepDate = TextBox1.Text;
        Session["ArrTime"] = ArrTime = TextBox4.Text;
        Session["ArrDate"] = ArrDate = TextBox3.Text;
        Response.Redirect("page4.aspx");
    }

    protected void TextBox1_TextChanged(object sender, EventArgs e)
    {

    }
}