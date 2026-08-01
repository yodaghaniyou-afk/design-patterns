class ConfigManager:
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super().__new__(cls)
            cls._instance.parametres = {}
        return cls._instance

    def definir(self, cle, valeur):
        self.parametres[cle] = valeur

    def obtenir(self, cle):
        return self.parametres.get(cle)


if __name__ == "__main__":
    config1 = ConfigManager()
    config1.definir("langue", "fr")

    config2 = ConfigManager()
    print(config2.obtenir("langue"))
    print("Même instance :", config1 is config2)
