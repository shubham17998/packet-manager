package io.mosip.registration.processor.core.abstractverticle;

/**
 * This class contains the address values to be used in Registration process
 * 
 * @author Pranav Kumar
 * @author Mukul Puspam
 * @since 0.0.1
 *
 */
public class MessageBusAddress {

	private String address;

	/**
	 * @param address
	 *            The bus address
	 */
	private MessageBusAddress(String address) {
		this.address = address;
	}

	/**
	 * @return The address
	 */
	public String getAddress() {
		return this.address;
	}

	public static final MessageBusAddress BATCH_BUS = new MessageBusAddress("batch-bus");
	public static final MessageBusAddress STRUCTURE_BUS_IN = new MessageBusAddress("structure-bus-in");
	public static final MessageBusAddress STRUCTURE_BUS_OUT = new MessageBusAddress("structure-bus-out");
	public static final MessageBusAddress DEMOGRAPHIC_BUS_IN = new MessageBusAddress("demographic-bus-in");
	public static final MessageBusAddress DEMOGRAPHIC_BUS_OUT = new MessageBusAddress("demographic-bus-out");
	public static final MessageBusAddress BIOMETRIC_BUS_IN = new MessageBusAddress("biometric-bus-in");
	public static final MessageBusAddress BIOMETRIC_BUS_OUT = new MessageBusAddress("biometric-bus-out");
	public static final MessageBusAddress FAILURE_BUS = new MessageBusAddress("failure-bus");
	public static final MessageBusAddress RETRY_BUS = new MessageBusAddress("retry");
	public static final MessageBusAddress ERROR = new MessageBusAddress("error");

}
