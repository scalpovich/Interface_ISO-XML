package in.unpluggedmind.controller;

import org.jpos.util.Logger;
import org.jpos.iso.packager.GenericPackager;
import org.jpos.iso.ISOMsg;
import org.jpos.util.SimpleLogListener;

public class Accept {
	
	private static String Packager1987 = "src/main/resources/isopackager/1987.xml";

    	public static String parseISO(String msg) {
		Logger logger = new Logger();
				 
		try {
			GenericPackager packager = new GenericPackager(Packager1987);
			ISOMsg isoMsg = new ISOMsg();
			isoMsg.setPackager(packager);

			logger.addListener(new SimpleLogListener());
			packager.setLogger(logger, "pacakger");

			isoMsg.unpack(msg.getBytes());

			System.out.println("Interfaces [] ISO Message Parsing Starts Here");
			try {
				System.out.println(" MTI [" + isoMsg.getMTI() + "]");
				/*for (int i = 0; i <= isoMsg.getMaxField(); i++) {
					if (isoMsg.hasField(i)) {
						System.out.println(" Field [" + i + "] : [" + isoMsg.getString(i) + "]");
					}
				}*/
				return MsgUtils.getISOMsgXml(isoMsg);
				
			} catch (Exception e) {
				System.out.println("Interfaces [] Exception Trace:");
				e.printStackTrace();
			} finally {
				System.out.println("Interfaces [] ISO Message Parsing Ends Here");
			}

		} catch (Exception e) {
			System.out.println("Interfaces []" + e);
		}
		return null;
	}
	
}
