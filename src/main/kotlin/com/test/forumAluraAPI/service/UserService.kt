package com.test.forumAluraAPI.service

import com.test.forumAluraAPI.entity.User
import org.springframework.stereotype.Service

@Service
class UserService(private var authors: List<User>) {
}