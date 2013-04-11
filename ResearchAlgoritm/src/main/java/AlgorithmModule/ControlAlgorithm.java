package AlgorithmModule;


import java.util.*;

public class ControlAlgorithm implements Runnable {

    public AbstractAlgorithm algorithm;
    Queue<byte[]> packets = new LinkedList<byte[]>();
    int count =1;


    public void run() {
        byte[] packetInByte =  packets.remove();
        Object packet = algorithm.preparePacket(packetInByte);
        String result = algorithm.apply(packet);
        System.out.println("To packet № " + count + " apply rule " + result);
        count++;
    }

    public void setAlgorithm(AbstractAlgorithm alg){
        this.algorithm = alg;
    }


    public void next(byte[] packet){
        this.packets.add(packet);
    }
}