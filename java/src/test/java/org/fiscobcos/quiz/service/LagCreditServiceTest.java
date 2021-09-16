/*
 * Copyright 2014-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fiscobcos.quiz.service;

import lombok.extern.slf4j.Slf4j;
import org.fiscobcos.quiz.BaseTest;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * LagCreditServiceTest
 *
 * @author graysonzhang
 * @Description: LagCreditServiceTest
 * @data 2019-05-08 17:48:14
 */
@Slf4j
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LagCreditServiceTest extends BaseTest {

    static private final String owner = "0xb1f49311c909bb22fdaf366771a15a983e8c0148";
    static private final String creditAddr = "";
    private final String toAddr = "0x015e68c28690b3250b36319d7c04653e0fbc4f26";
    @Autowired
    private CreditLetterService creditLetterService;
//
//    @Test
//    public void testAdeploy(){
//        log.info("----test deploy---");
//        LAGCredit lagCredit = creditLetterService.deploy();
//        log.info("deploy LAGCredit address : {}", lagCredit);
//        creditAddr = lagCredit.getContractAddress();
//    }
//
//    @Test
//    public void testBLoad(){
//        log.info("----test load---");
//        LAGCredit lagCredit = creditLetterService.load(creditAddr);
//        log.info("load LAGCredit address : {}", lagCredit.getContractAddress());
//    }
//
//    @Test
//    public void testCTransfer(){
//        log.info("----test transfer---");
//        boolean flag = creditLetterService.transfer(creditAddr, toAddr, new BigInteger("1000"));
//        if(flag){
//            log.info("transfer 1000 success!");
//        }else{
//            log.info("transfer failed!");
//        }
//    }
//
//    @Test
//    public void testDGetBalanceByOwner() throws Exception{
//        log.info("----test getBalance---");
//        long balance = creditLetterService.getBalanceByOwner(creditAddr, owner);
//        log.info("the owner : {}, balance : {}", owner, balance);
//        long tobalance = creditLetterService.getBalanceByOwner(creditAddr, toAddr);
//        log.info("the to : {}, balance : {}", toAddr, tobalance);
//    }
//
//    @Test
//    public void testEGetTotalSupply() throws Exception{
//        log.info("----test getTotalSupply---");
//        long total = creditLetterService.getTotalSupply(creditAddr);
//        log.info("total : {}", total);
//    }

}
