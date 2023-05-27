package ecr.web.app.client.services;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class RefondsService_Proxy extends RemoteServiceProxy implements ecr.web.app.client.services.RefondsServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "ecr.web.app.client.services.RefondsService";
  private static final String SERIALIZATION_POLICY ="7F19F51CBE75B7F78369B70007009EE6";
  private static final ecr.web.app.client.services.RefondsService_TypeSerializer SERIALIZER = new ecr.web.app.client.services.RefondsService_TypeSerializer();
  
  public RefondsService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "springGwtServices/Refondtransaction", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void Refondtransaction(java.lang.String termIpAdr, ecr.web.app.shared.TransactionDataIn data, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("RefondsService_Proxy", "Refondtransaction");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("ecr.web.app.shared.TransactionDataIn/4273729200");
      streamWriter.writeString(termIpAdr);
      streamWriter.writeObject(data);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
