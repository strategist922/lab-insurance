package com.lab.insurance.contract.creation.gateway.integration;

import org.lab.insurance.contract.creation.core.domain.ContractCreationData;
import org.lab.insurance.domain.IntegrationConstants.Channels;
import org.lab.insurance.domain.contract.Contract;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface ContractCreationGateway {

	@Gateway(requestChannel = Channels.ContractCreationRequest, replyChannel = Channels.ContractCreationResponse)
	Contract process(ContractCreationData data);

}
