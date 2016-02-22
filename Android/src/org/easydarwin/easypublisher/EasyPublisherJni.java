package org.easydarwin.easypublisher;

public class EasyPublisherJni {
	
    static {
        System.load("libEasyPublisher.so");
    }
    
	/**
	 * Initialized publisher with width and height.
	 *
	 * <pre>This function must be called firstly.</pre>
	 *
	 * @return {1} if successful
	 */
    public native int EasyPublisherInit(int width, int height);
	
	/**
	* start to publish stream.
	*
	* @param url
	*
	* @return {1} if successful
	*/
    public native int EasyPublisherStartPublish(String url);
	
	/**
	* set live video data.
	*
	* @param cameraType: CAMERA_FACING_BACK with 0, CAMERA_FACING_FRONT with 1
	* @param curOrg: LANDSCAPE with 0, PORTRAIT 1
	*
	* @return {1} if successful
	*/
    public native int EasyPublisherOnCaptureVideoData(byte[] data, int len, int cameraType, int curOrg);
	
	/**
	 * Stop publisher.
	 *
	 * @return {1} if successful
	 */
    public native int EasyPublisherStopPublish();
}
