/**
 * 
 */
package com.avengercode.apirestswagger.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author abraao
 * @size 2019-07-30
 * AvengersCode 
 */
@CrossOrigin
@RestController
@Api
public class InitController {

	@ApiOperation(value = "get")
	@GetMapping("/get")
	public Object get(){
		return "{ 'mensagem':'Seja Bem Vindo!' }";
	}
}
