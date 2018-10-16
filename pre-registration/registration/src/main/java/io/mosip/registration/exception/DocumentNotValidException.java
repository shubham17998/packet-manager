package io.mosip.registration.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;
import io.mosip.registration.errorcodes.ErrorCodes;

public class DocumentNotValidException extends BaseUncheckedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5252109871704396987L;

	public DocumentNotValidException() {
		super();

	}

	public DocumentNotValidException(String message) {
		super(ErrorCodes.PRG_PAM‌_004.toString(), message);

	}

	public DocumentNotValidException(String message, Throwable cause) {
		super(ErrorCodes.PRG_PAM‌_004.toString(), message, cause);

	}

}
