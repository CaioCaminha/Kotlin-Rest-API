package com.test.forumAluraAPI.exceptions

import java.lang.RuntimeException

class NotFoundException(message: String?): RuntimeException(message) {
}