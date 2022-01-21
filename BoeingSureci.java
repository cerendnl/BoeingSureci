
    import com.qbitra.rpa.QbitraRpa;
    import com.qbitra.rpa.ExcelSession;
    import com.qbitra.rpa.QbitraRunSession;
    import com.qbitra.rpa.QbitraRpaSettings;
    import com.qbitra.rpa.utils.ScrollType;
    import org.sikuli.script.*;
    import org.sikuli.vnc.*;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;

    import com.google.gson.*;
import java.util.*;
import java.text.*;

    
    public class BoeingSureci {
      private static int  ExitCode = 0;
      public static String HomePath = "";
      public static String FlowPath = "";
      public static String DesktopPath = "";
      public static String TempPath = "";
      public static String DownloadsPath = "";
      public static void main(String[] args) throws Exception {
      
        QbitraRpa rpa = null;
        try {
          rpa = new QbitraRpa(args);
          HomePath = rpa.getHomePath();
          TempPath = rpa.getTempFolderPath();
          FlowPath = rpa.getFlowPath();
          DesktopPath = rpa.getDesktopPath();
          DownloadsPath = rpa.getDownloadsPath();
          Exception Exception = new Exception();
          

    QbitraRpaSettings.DefaultTimeOut=20;
  ///>
rpa.echo("Execute Node:4");

    rpa.waitImage("images/winIcon.png",60);
rpa.echo("Execute Node:3");

	rpa.sleep(0.5);
	rpa.keyboardWrite("win+d");
	rpa.sleep(0.5);

    QbitraRpaSettings.DefaultTimeOut=20;
  ///>
rpa.echo("Execute Node:2");

 //< [GetEnvironment] [comment="env"] [rows="[{"firtsValueInput":{"value":"PONum","type":"input"},"secondValueInput":{"value":"PONum","type":"input"},"id":0},{"firtsValueInput":{"value":"invoiceNo","type":"input"},"secondValueInput":{"value":"InvoiceNo","type":"input"},"id":1},{"firtsValueInput":{"value":"dueDate","type":"input"},"secondValueInput":{"value":"DueDate","type":"input"},"id":2},{"firtsValueInput":{"value":"invoiceDate","type":"input"},"secondValueInput":{"value":"InvoiceDate","type":"input"},"id":3},{"firtsValueInput":{"value":"amountDue","type":"input"},"secondValueInput":{"value":"InvoiceAmount","type":"input"},"id":4},{"firtsValueInput":{"value":"Unit","type":"input"},"secondValueInput":{"value":"Unit","type":"input"},"id":5},{"firtsValueInput":{"value":"productDescription","type":"input"},"secondValueInput":{"value":"PartNo","type":"input"},"id":6},{"firtsValueInput":{"value":"UnitPrice","type":"input"},"secondValueInput":{"value":"UnitPrice","type":"input"},"id":7},{"firtsValueInput":{"value":"quantity","type":"input"},"secondValueInput":{"value":"UnitQty","type":"input"},"id":8}]"] 
String PONum= rpa.getEnvironmentVariable("PONum");
String invoiceNo= rpa.getEnvironmentVariable("InvoiceNo");
String dueDate= rpa.getEnvironmentVariable("DueDate");
String invoiceDate= rpa.getEnvironmentVariable("InvoiceDate");
String amountDue= rpa.getEnvironmentVariable("InvoiceAmount");
String Unit= rpa.getEnvironmentVariable("Unit");
String productDescription= rpa.getEnvironmentVariable("PartNo");
String UnitPrice= rpa.getEnvironmentVariable("UnitPrice");
String quantity= rpa.getEnvironmentVariable("UnitQty");

 
rpa.echo("Execute Node:3");
String uom= rpa.getEnvironmentVariable("uom","EA");
String unitAmt= rpa.getEnvironmentVariable("unitAmt","29.71");
String amount= rpa.getEnvironmentVariable("amount","29.71");
String partiNumarasi= rpa.getEnvironmentVariable("partiNumarası","BACR15GA5-14B");
String ProcessCode = rpa.getEnvironmentVariable("ProcessCode", "123123");
String partiNo = rpa.getEnvironmentVariable("partiNo", "M21021958");


String[] SplitDate = invoiceDate.split("T");
String InvoiceTarih = SplitDate[0];
String[] StringInvoiceDate = InvoiceTarih.split("-");

invoiceDate = StringInvoiceDate[2] + "-" + StringInvoiceDate[1] + "-" + StringInvoiceDate[0];




rpa.echo("Execute Node:4");

 //< [Variable] [comment="var"] [rows="[{"firtsValueInput":{"value":"departmanKodu","type":"input"},"secondValueInput":{"value":"\"AD340101\"","type":"input"},"id":0,"selected":"String"}]"] 
String departmanKodu="AD340101";

 

    QbitraRpaSettings.DefaultTimeOut=20;
  ///>
rpa.echo("Execute Node:20");

 //< [KillProcess] [comment="Ax32.exe"] [rows="[{"applicationExe":{"value":"Ax32.exe","type":"input"},"id":0}]"]  
rpa.killProcess("Ax32.exe");

 
rpa.echo("Execute Node:9");

  rpa.sleep(3);

rpa.echo("Execute Node:2");

	App app = rpa.openApp("C:\\\\Program Files (x86)\\\\Microsoft Dynamics AX\\\\50\\\\Client\\Bin\\\\Ax32.exe");
rpa.echo("Execute Node:7");
QbitraRpaSettings.getScreen().type(Key.UP,Key.WIN);
rpa.sleep(1);
rpa.echo("Execute Node:4");

  rpa.click("images/satinalmaSiparisiAyrintilari.png");

rpa.echo("Execute Node:5");

    rpa.waitImage("images/satinalmaSiparisiSayfasi.png",60);
rpa.echo("Execute Node:7");
QbitraRpaSettings.getScreen().type(Key.UP,Key.WIN);
rpa.sleep(1);

    QbitraRpaSettings.DefaultTimeOut=20;
  ///>
rpa.echo("Execute Node:7");
QbitraRpaSettings.getScreen().type(Key.UP,Key.WIN);
rpa.sleep(1);
rpa.echo("Execute Node:9");

    rpa.type("images/satinAlmaId.png.targetOffset(-11,11)",PONum);

rpa.echo("Execute Node:6");

	rpa.sleep(1);
	rpa.keyboardSend(Key.ENTER);
	rpa.sleep(1);
rpa.echo("Execute Node:21");

  rpa.doubleClick("images/nh4gt.png.targetOffset(-15,9)");

rpa.echo("Execute Node:20");

	rpa.sleep(0.5);
	rpa.keyboardSend(String.valueOf(partiNo));
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ENTER);
	rpa.sleep(0.5);
rpa.echo("Execute Node:20");

  rpa.doubleClick("images/satirDurumuAcikSiparis.png.targetOffset(-5,25)");

rpa.echo("Execute Node:21");

	rpa.sleep(0.5);
	rpa.keyboardWrite("ctrl+c");
	rpa.sleep(0.5);
rpa.echo("Execute Node:22");

    String satirDurumu = rpa.getFromClipboard();
rpa.echo("Execute Node:19");

 //< [Condition] [comment="acik siparis varsa"] [combine="ANY"] [rows="[{"firtsValueInput":{"value":"satirDurumu","type":"input"},"secondValueInput":{"value":"\"Açık sipariş\"","type":"input"},"id":0,"selected":"isequalforstring"},{"firtsValueInput":{"value":"satirDurumu","type":"input"},"secondValueInput":{"value":"\"Alındı\"","type":"input"},"id":1,"selected":"isequalforstring"}]"] 
 if((satirDurumu.equals("Açık sipariş"))||(satirDurumu.equals("Alındı")))
 {
 

    QbitraRpaSettings.DefaultTimeOut=20;
  ///>
rpa.echo("Execute Node:5");

  rpa.click("images/stokButon.png");

rpa.echo("Execute Node:4");

	rpa.sleep(1);
	rpa.keyboardSend(Key.DOWN);
	rpa.sleep(0.5);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ENTER);
rpa.echo("Execute Node:7");

    rpa.waitImage("images/hareketler.png",60);
rpa.echo("Execute Node:17");

	rpa.sleep(3);
	rpa.sleep(0.5);
	rpa.keyboardWrite("ctrl+e");
	rpa.sleep(0.5);
rpa.echo("Execute Node:18");

  rpa.click("images/excelSimgesi.png");

rpa.echo("Execute Node:25");

  rpa.deleteFileOrFolder("C:\\Users\\robomail\\Documents\\Book1.xlsx");
rpa.echo("Execute Node:19");

	rpa.sleep(1);
	rpa.keyboardWrite("alt+f4");
	rpa.sleep(0.5);
rpa.echo("Execute Node:21");

  rpa.click("images/kayitYeriSecimi.png");

rpa.echo("Execute Node:22");

  rpa.sleep(1);

rpa.echo("Execute Node:23");

  rpa.click("images/documents.png");

rpa.echo("Execute Node:24");

	rpa.sleep(1);
	rpa.keyboardSend(Key.TAB);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.TAB);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ENTER);
	rpa.sleep(0.5);
rpa.echo("Execute Node:26");

ExcelSession excel_session = rpa.openExcel("C:\\Users\\robomail\\Documents\\Book1.xlsx","","write_only");

rpa.echo("Execute Node:27");

JsonArray stokHareketlerExcelData = rpa.fetchExcelColumnValues(excel_session,"",true,1);

rpa.echo("Execute Node:31");
int counter = 0;
rpa.echo("Execute Node:28");

for (JsonElement item:stokHareketlerExcelData){
String giris = item.getAsJsonObject().get("Giriş") != null ? item.getAsJsonObject().get("Giriş").getAsString() : ""; 
String tesis = item.getAsJsonObject().get("Tesis") != null ? item.getAsJsonObject().get("Tesis").getAsString() : ""; 
String miktar = item.getAsJsonObject().get("Miktar") != null ? item.getAsJsonObject().get("Miktar").getAsString() : ""; 


rpa.echo("Execute Node:60");
rpa.echo("giris: " + giris);
rpa.echo("tesis: " + tesis);
rpa.echo("miktar: " + miktar);
rpa.echo("quantity" + quantity);
rpa.echo("Execute Node:36");

 //< [Condition] [comment="toplam satırı varsa counterı artırma"] [combine="ANY"] [rows="[{"firtsValueInput":{"value":"tesis","type":"input"},"secondValueInput":{"value":"\"Toplam\"","type":"input"},"id":0,"selected":"isequalforstring"}]"] 
 if((tesis.equals("Toplam")))
 {
 
}else{
rpa.echo("Execute Node:31");
counter++;
rpa.echo("Execute Node:44");

 //< [Condition] [comment="if giris is alındı ve miktar eşitse"] [combine="ALL"] [rows="[{"firtsValueInput":{"value":"giris","type":"variable"},"secondValueInput":{"value":"\"Alındı\"","type":"input"},"id":0,"selected":"isequalforstring"},{"firtsValueInput":{"value":"miktar","type":"input"},"secondValueInput":{"value":"quantity","type":"variable"},"id":1,"selected":"isequalforstring"}]"] 
 if((giris.equals("Alındı"))&&(miktar.equals(quantity)))
 {
 
rpa.echo("Execute Node:39");

	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ESC);
	rpa.sleep(0.5);

 //< [Condition] [comment="simdi al "] [combine="ALL"] [rows="[{"firtsValueInput":{"value":"\"images/simdialQuantity.png.targetOffset(2,25)\"","type":"input"},"secondValueInput":{"value":"","type":""},"id":0,"selected":"isvisible"}]"] 
 if((rpa.isPresent("images/simdialQuantity.png.targetOffset(2,25)")))
 {
 
rpa.echo("Execute Node:54");

  rpa.doubleClick("images/simdialQuantity.png.targetOffset(2,25)");

rpa.echo("Execute Node:50");

	rpa.sleep(0.5);
	rpa.keyboardSend(String.valueOf(quantity));
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ENTER);
	rpa.sleep(0.5);
}else{
}
rpa.echo("Execute Node:57");

  rpa.click("images/departmanKodu.png.targetOffset(-4,22)");

rpa.echo("Execute Node:59");

  rpa.click("images/departmanKodu.png.targetOffset(-4,22)");

rpa.echo("Execute Node:56");

	rpa.sleep(1);
	rpa.keyboardSend(String.valueOf(departmanKodu));
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ENTER);
	rpa.sleep(0.5);
}else{
rpa.echo("Execute Node:20");

 //< [KillProcess] [comment="Ax32.exe"] [rows="[{"applicationExe":{"value":"Ax32.exe","type":"input"},"id":0}]"]  
rpa.killProcess("Ax32.exe");

 
}
}
}rpa.echo("Execute Node:42");

 //< [Condition] [comment="counter > 1"] [combine="ALL"] [rows="[{"firtsValueInput":{"value":"counter","type":"input"},"secondValueInput":{"value":"1","type":"input"},"id":0,"selected":"greaterthan"}]"] 
 if((counter > 1))
 {
 
rpa.echo("Execute Node:43");

    HashMap<String,String> _u3DqP =   new HashMap<String, String>();
    HashMap<String,String> _mDJVA = new HashMap<String, String>();
    _u3DqP.put("PONum",PONum);
_mDJVA.put("Content-Type","application/json");

    String apiResponse = rpa.callApiWithForm("POST","http://172.23.27.18:8000/hype/webhook/6/stokhatawebhook/stok",_u3DqP,_mDJVA);

rpa.echo("Execute Node:63");

  rpa.quit();
  System.exit(0);

}else{
}

    QbitraRpaSettings.DefaultTimeOut=20;
  ///>
rpa.echo("Execute Node:31");

    rpa.waitImage("images/deftereNakil.png",60);
rpa.echo("Execute Node:2");

  rpa.click("images/deftereNakil.png");

rpa.echo("Execute Node:3");

    rpa.waitImage("images/fatura3.png.targetOffset(-29,35)",60);
rpa.echo("Execute Node:4");

  rpa.click("images/fatura3.png.targetOffset(-29,35)");

rpa.echo("Execute Node:5");

    rpa.waitImage("images/deftereNakilTarihi.png.targetOffset(-1,8)",120);
rpa.echo("Execute Node:7");

  rpa.click("images/deftereNakilTarihi.png.targetOffset(-1,8)");

rpa.echo("Execute Node:9");
String monthDate="";

String[] splitMonth=invoiceDate.split("-");
String dayDate=splitMonth[0];
String yearDate=splitMonth[2];
switch(splitMonth[1]) {
  case "JAN":
    monthDate="01";
    break;
  case "FEB":
    monthDate="02";
    break;
    case "MAR":
    monthDate="03";
    break;
    case "APR":
    monthDate="04";
    break;
    case "MAY":
    monthDate="05";
    break;
    case "JUNE":
    monthDate="06";
    break;
    case "JULY":
    monthDate="07";
    break;
     case "AUG":
    monthDate="08";
    break;
     case "SEP":
    monthDate="09";
    break;
     case "OCT":
    monthDate="10";
    break;
     case "NOV":
    monthDate="11";
    break;
     case "DEC":
    monthDate="12";
    break;
  default:
    // code block
}
rpa.echo("Execute Node:8");

	rpa.sleep(0.5);
	rpa.keyboardSend(String.valueOf(invoiceDate));
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ENTER);
	rpa.sleep(0.5);
	rpa.keyboardSend(String.valueOf(invoiceNo));
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ENTER);
	rpa.sleep(0.5);
rpa.echo("Execute Node:11");

  rpa.click("images/miktarSimdiAl.png.targetOffset(76,-6)");

rpa.echo("Execute Node:12");

    rpa.waitImage("images/simdiAlSec.png",60);
rpa.echo("Execute Node:13");

  rpa.click("images/simdiAlSec.png");

rpa.echo("Execute Node:14");

  rpa.click("images/btnToplamlar.png");

rpa.echo("Execute Node:47");

  rpa.sleep(5);
rpa.echo("Execute Node:45");

 //< [Condition] [comment="deftere nakildeki hata çıkarsa"] [combine="ALL"] [rows="[{"firtsValueInput":{"value":"\"images/deftereNakildekiHata.png.targetOffset(150,50)\"","type":"image"},"secondValueInput":{"value":"","type":""},"id":0,"selected":"isvisible"}]"] 
 if((rpa.isPresent("images/deftereNakildekiHata.png.targetOffset(150,50)")))
 {
 
rpa.echo("Execute Node:46");

  rpa.click("images/deftereNakildekiHata.png.targetOffset(150,50)");

rpa.echo("Execute Node:49");

  rpa.sleep(1);

rpa.echo("Execute Node:48");

  rpa.click("images/defterenakildeCarpi.png");

rpa.echo("Execute Node:15");

    rpa.waitImage("images/toplamlarFaturaTutari.png",60);
rpa.echo("Execute Node:16");

  rpa.click("images/toplamlarFaturaTutari.png.targetOffset(73,1)");

rpa.echo("Execute Node:24");

  rpa.doubleClick("images/toplamlarFaturaTutari.png.targetOffset(73,1)");

rpa.echo("Execute Node:17");

	rpa.sleep(1);
	rpa.keyboardWrite("ctrl+a");
	rpa.sleep(0.5);
	rpa.keyboardWrite("ctrl+c");
	rpa.sleep(1);
rpa.echo("Execute Node:20");

    String faturaTutari = rpa.getFromClipboard();
rpa.echo("Execute Node:21");

 //< [Condition] [comment="amountDue faturaTutarina eşit mi ?"] [combine="ALL"] [rows="[{"firtsValueInput":{"value":"amountDue","type":"variable"},"secondValueInput":{"value":"amountDue","type":"variable"},"id":0,"selected":"isequalforstring"}]"] 
 if((amountDue.equals(amountDue)))
 {
 
rpa.echo("Execute Node:22");

    rpa.echo("tutar eşit"); 

rpa.echo("Execute Node:32");

	rpa.sleep(1);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ESC);
	rpa.sleep(0.5);
rpa.echo("Execute Node:28");

  rpa.click("images/btnTamam.png.targetOffset(-55,1)");

rpa.echo("Execute Node:33");

    rpa.waitImage("images/sorgulamalar.png",60);
rpa.echo("Execute Node:34");

  rpa.click("images/sorgulamalar.png");

rpa.echo("Execute Node:35");

	rpa.sleep(1);
	rpa.keyboardSend(Key.DOWN);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.DOWN);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.DOWN);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.DOWN);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.DOWN);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.DOWN);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.DOWN);
	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ENTER);
	rpa.sleep(0.5);
rpa.echo("Execute Node:36");

    rpa.waitImage("images/faturaGunlugu.png",60);
rpa.echo("Execute Node:37");

    rpa.type("images/faturaNoFiltre.png.targetOffset(-15,9)",invoiceNo);

rpa.echo("Execute Node:38");

	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ENTER);
	rpa.sleep(0.5);
rpa.echo("Execute Node:39");

  rpa.doubleClick("images/fisNoFiltre.png.targetOffset(-2,36)");

rpa.echo("Execute Node:40");

	rpa.sleep(0.5);
	rpa.keyboardWrite("ctrl+c");
	rpa.sleep(0.5);
rpa.echo("Execute Node:41");

    String fisNumarasi = rpa.getFromClipboard();

rpa.echo("Execute Node:42");

    HashMap<String,String> _ZNaaA =   new HashMap<String, String>();
    HashMap<String,String> _NNjdT = new HashMap<String, String>();
    _ZNaaA.put("PONum",PONum);
_ZNaaA.put("fisNumarasi",fisNumarasi);
_ZNaaA.put("invoiceNo",invoiceNo);
_NNjdT.put("Content-Type","application/json");

    String apiResponse3 = rpa.callApiWithForm("POST","http://172.23.27.18:8000/hype/webhook/6/faturalandiwebhook/faturalandi",_ZNaaA,_NNjdT);

rpa.echo("Execute Node:43");

    HashMap<String,String> _owgEz =   new HashMap<String, String>();
    HashMap<String,String> _oFmh1 = new HashMap<String, String>();
    _owgEz.put("PONum",PONum);
_owgEz.put("invoiceNo",invoiceNo);
_owgEz.put("invoiceDate",invoiceDate);
_owgEz.put("ProcessCode",ProcessCode);
_owgEz.put("productDescription",productDescription);
_owgEz.put("amountDue",amountDue);
_owgEz.put("AccountName","BOEING");
_owgEz.put("Unit",Unit);
_owgEz.put("UnitPrice",UnitPrice);
_owgEz.put("quantity",quantity);
_owgEz.put("partiNo",partiNo);
_owgEz.put("DueDate",dueDate);
_owgEz.put("DueDate",dueDate);
_oFmh1.put("Content-Type","application/json");

    String apiResponse4 = rpa.callApiWithForm("POST","http://172.23.27.18:8000/hype/webhook/4/transferstatusupdatewebhook/update",_owgEz,_oFmh1);

rpa.echo("Execute Node:20");

 //< [KillProcess] [comment="Ax32.exe"] [rows="[{"applicationExe":{"value":"Ax32.exe","type":"input"},"id":0}]"]  
rpa.killProcess("Ax32.exe");

 
}else{
rpa.echo("Execute Node:23");

    rpa.echo("tutar eşit değil"); 

rpa.echo("Execute Node:26");

    HashMap<String,String> _e0FDX =   new HashMap<String, String>();
    HashMap<String,String> _yhrMK = new HashMap<String, String>();
    _e0FDX.put("PONum",PONum);
_e0FDX.put("invoiceNo",invoiceNo);
_yhrMK.put("Content-Type","application/json");

    String apiResponse = rpa.callApiWithForm("POST","http://172.23.27.18:8000/hype/webhook-test/2/faturatutarhatasiwebhook/faturaTutarHata",_e0FDX,_yhrMK);

rpa.echo("Execute Node:27");

	rpa.sleep(0.5);
	rpa.keyboardSend(Key.ESC);
	rpa.sleep(0.5);
rpa.echo("Execute Node:29");

  rpa.rightClick("images/AxAcik.png");

rpa.echo("Execute Node:30");

  rpa.click("images/axClose.png");

}
}else{
}
rpa.echo("Execute Node:10");

  rpa.sleep(2);
rpa.echo("Execute Node:8");

 //< [Condition] [comment="eger uyarı cıkarsa"] [combine="ALL"] [rows="[{"firtsValueInput":{"value":"\"images/guncellemeIptalButonYes.png.targetOffset(40,49)\"","type":"image"},"secondValueInput":{"value":"","type":""},"id":0,"selected":"isvisible"}]"] 
 if((rpa.isPresent("images/guncellemeIptalButonYes.png.targetOffset(40,49)")))
 {
 
rpa.echo("Execute Node:9");

  rpa.click("images/guncellemeIptalButonYes.png.targetOffset(40,49)");

rpa.echo("Execute Node:29");

  rpa.rightClick("images/AxAcik.png");

rpa.echo("Execute Node:30");

  rpa.click("images/axClose.png");

}else{
}
}else{
rpa.echo("Execute Node:20");

 //< [KillProcess] [comment="Ax32.exe"] [rows="[{"applicationExe":{"value":"Ax32.exe","type":"input"},"id":0}]"]  
rpa.killProcess("Ax32.exe");

 
}
        } catch (Exception ex) {
          ex.printStackTrace();
          Thread.sleep(1);
          ExitCode =- 1;
        } finally {
          rpa.quit();
          System.exit(ExitCode);
        }
      }
    
    }
  