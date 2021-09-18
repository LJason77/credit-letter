// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.4.25;

import "./CreditLetter.sol";

/**
 * @title 信用证工厂
 * 信用证工厂，处理信用证的创建和分割。
 */

contract CreditLetterFactory {
    event CreateLog(address addr, uint256 timestamp);

    function create(
        address issuer,
        address holder,
        address acceptor,
        uint256 issuanceTime,
        uint256 interestRate,
        uint256 credit
    ) public {
        CreditLetter creditLetter = new CreditLetter(issuer, holder, acceptor, issuanceTime, interestRate, credit);
        emit CreateLog(address(creditLetter), issuanceTime);
    }

    function split(address originalAddress, uint256 amount, uint256 timestamp) public {
        CreditLetter originalLetter = CreditLetter(originalAddress);
        (address issuer, address holder, address acceptor, , uint256 interestRate, uint256 credit, ,) = originalLetter.getInfo();
        originalLetter.resetCreditAmount(credit - amount, timestamp);
        CreditLetter creditLetter = new CreditLetter(issuer, holder, acceptor, timestamp, interestRate, amount);
        emit CreateLog(address(creditLetter), timestamp);
    }
}