package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.*;


public interface OauthAccessTokensRepository extends CrudRepository<OauthAccessTokensId, Long> {

}
