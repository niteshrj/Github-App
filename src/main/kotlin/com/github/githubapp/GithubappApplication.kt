package com.github.githubapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GithubappApplication

fun main(args: Array<String>) {
    runApplication<GithubappApplication>(*args)
}
