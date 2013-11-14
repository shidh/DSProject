package client;


import common.messages.KVMessage;

public class KVStore implements KVCommInterface {

	
	/**
	 * Initialize KVStore with address and port of KVServer
	 * @param address the address of the KVServer
	 * @param port the port of the KVServer
	 */
	public KVStore(String address, int port) {
		
	}
	
	

    /** 
     * Establishes the connection to the KV Server. 
     * @throws Exception if connection could not be established. 
     */ 
	@Override
	public void connect() throws Exception {
		// TODO Auto-generated method stub
		
	}

    /** 
     * disconnects the client from the currently connected server. 
     */
	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	
	/** 
     * Inserts a key-value pair into the KVServer. 
     * @param key the key that identifies the given value. 
     * @param value the value that is indexed by the given key. 
     * @return a message that confirms the insertion of the tuple or an error. 
     * @throws Exception if put command cannot be executed 
     *     (e.g. not connected to any KV server). 
     */ 
	@Override
	public KVMessage put(String key, String value) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	/** 
     * Retrieves the value for a given key from the KVServer. 
     * @param key the key that identifies the value. 
     * @return the value, which is indexed by the given key. 
     * @throws Exception if put command cannot be executed 
     *     (e.g. not connected to any KV server). 
     */ 

	@Override
	public KVMessage get(String key) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
