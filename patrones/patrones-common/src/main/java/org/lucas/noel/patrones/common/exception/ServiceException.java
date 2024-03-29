package org.lucas.noel.patrones.common.exception;


import org.lucas.noel.patrones.common.enums.ErrorEnum;

/**
 * @author netyjq@gmail.com
 * @date 2019-04-28
 */
public class ServiceException extends AbstractException {

    @Override
    String buildErrorMessage() {
        return ErrorEnum.BIZ_ERROR.buildMessage(this.getMessage()).toString();
    }

    public ServiceException(String message) {
        super(message);
    }
}
