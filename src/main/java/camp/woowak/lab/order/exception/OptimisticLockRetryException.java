package camp.woowak.lab.order.exception;

import camp.woowak.lab.common.exception.ConflictException;

public class OptimisticLockRetryException extends ConflictException {
	public OptimisticLockRetryException(String message) {
		super(OrderErrorCode.OPTIMISTIC_LOCK_RETRY_ERROR, message);
	}
}
